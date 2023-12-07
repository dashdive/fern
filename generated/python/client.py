# This file was auto-generated by Fern from our API Definition.

import typing
import urllib.parse
from json.decoder import JSONDecodeError

import httpx

from .core.api_error import ApiError
from .core.client_wrapper import AsyncClientWrapper, SyncClientWrapper
from .core.jsonable_encoder import jsonable_encoder
from .errors.bad_request_error import BadRequestError
from .errors.internal_server_error import InternalServerError
from .types.receive_s_3_event_response import ReceiveS3EventResponse
from .types.s_3_event import S3Event

try:
    import pydantic.v1 as pydantic  # type: ignore
except ImportError:
    import pydantic  # type: ignore

# this is used as the default value for optional parameters
OMIT = typing.cast(typing.Any, ...)


class BenJammingReillyApi:
    def __init__(
        self,
        *,
        base_url: str,
        api_key: str,
        timeout: typing.Optional[float] = 60,
        httpx_client: typing.Optional[httpx.Client] = None,
    ):
        self._client_wrapper = SyncClientWrapper(
            base_url=base_url,
            api_key=api_key,
            httpx_client=httpx.Client(timeout=timeout) if httpx_client is None else httpx_client,
        )

    def receive_s_3_event(self, *, request: S3Event) -> ReceiveS3EventResponse:
        """
        This endpoint receives notifications for events happening in an S3 bucket, like file uploads.

        Parameters:
            - request: S3Event.
        """
        _response = self._client_wrapper.httpx_client.request(
            "POST",
            urllib.parse.urljoin(f"{self._client_wrapper.get_base_url()}/", "s3"),
            json=jsonable_encoder(request),
            headers=self._client_wrapper.get_headers(),
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ReceiveS3EventResponse, _response.json())  # type: ignore
        if _response.status_code == 400:
            raise BadRequestError(pydantic.parse_obj_as(typing.Any, _response.json()))  # type: ignore
        if _response.status_code == 500:
            raise InternalServerError(pydantic.parse_obj_as(typing.Any, _response.json()))  # type: ignore
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncBenJammingReillyApi:
    def __init__(
        self,
        *,
        base_url: str,
        api_key: str,
        timeout: typing.Optional[float] = 60,
        httpx_client: typing.Optional[httpx.AsyncClient] = None,
    ):
        self._client_wrapper = AsyncClientWrapper(
            base_url=base_url,
            api_key=api_key,
            httpx_client=httpx.AsyncClient(timeout=timeout) if httpx_client is None else httpx_client,
        )

    async def receive_s_3_event(self, *, request: S3Event) -> ReceiveS3EventResponse:
        """
        This endpoint receives notifications for events happening in an S3 bucket, like file uploads.

        Parameters:
            - request: S3Event.
        """
        _response = await self._client_wrapper.httpx_client.request(
            "POST",
            urllib.parse.urljoin(f"{self._client_wrapper.get_base_url()}/", "s3"),
            json=jsonable_encoder(request),
            headers=self._client_wrapper.get_headers(),
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ReceiveS3EventResponse, _response.json())  # type: ignore
        if _response.status_code == 400:
            raise BadRequestError(pydantic.parse_obj_as(typing.Any, _response.json()))  # type: ignore
        if _response.status_code == 500:
            raise InternalServerError(pydantic.parse_obj_as(typing.Any, _response.json()))  # type: ignore
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)
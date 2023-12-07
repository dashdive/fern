# This file was auto-generated by Fern from our API Definition.

import datetime as dt
import typing

from ..core.datetime_utils import serialize_datetime
from .s_3_event_copy_object_copy_source import S3EventCopyObjectCopySource
from .s_3_event_copy_object_provider import S3EventCopyObjectProvider

try:
    import pydantic.v1 as pydantic  # type: ignore
except ImportError:
    import pydantic  # type: ignore


class S3EventCopyObject(pydantic.BaseModel):
    version_id: typing.Optional[str] = pydantic.Field(alias="versionId")
    copy_source: S3EventCopyObjectCopySource = pydantic.Field(alias="copySource")
    object_key: str = pydantic.Field(alias="objectKey")
    bucket: str
    timestamp: dt.datetime
    provider: S3EventCopyObjectProvider
    customer_id: typing.Optional[str] = pydantic.Field(alias="customerId")
    feature_id: typing.Optional[str] = pydantic.Field(alias="featureId")
    client_type: typing.Optional[str] = pydantic.Field(alias="clientType")
    client_id: typing.Optional[str] = pydantic.Field(alias="clientId")

    def json(self, **kwargs: typing.Any) -> str:
        kwargs_with_defaults: typing.Any = {"by_alias": True, "exclude_unset": True, **kwargs}
        return super().json(**kwargs_with_defaults)

    def dict(self, **kwargs: typing.Any) -> typing.Dict[str, typing.Any]:
        kwargs_with_defaults: typing.Any = {"by_alias": True, "exclude_unset": True, **kwargs}
        return super().dict(**kwargs_with_defaults)

    class Config:
        frozen = True
        smart_union = True
        allow_population_by_field_name = True
        json_encoders = {dt.datetime: serialize_datetime}

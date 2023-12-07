# This file was auto-generated by Fern from our API Definition.

import datetime as dt
import typing

from ..core.datetime_utils import serialize_datetime
from .s_3_event_delete_objects_deleted_objects_item import S3EventDeleteObjectsDeletedObjectsItem
from .s_3_event_delete_objects_provider import S3EventDeleteObjectsProvider

try:
    import pydantic.v1 as pydantic  # type: ignore
except ImportError:
    import pydantic  # type: ignore


class S3EventDeleteObjects(pydantic.BaseModel):
    deleted_objects: typing.List[S3EventDeleteObjectsDeletedObjectsItem] = pydantic.Field(alias="deletedObjects")
    bucket: str
    timestamp: dt.datetime
    provider: S3EventDeleteObjectsProvider
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

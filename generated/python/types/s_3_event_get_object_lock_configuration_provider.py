# This file was auto-generated by Fern from our API Definition.

import enum
import typing

T_Result = typing.TypeVar("T_Result")


class S3EventGetObjectLockConfigurationProvider(str, enum.Enum):
    AWS = "aws"
    BACKBLAZE = "backblaze"
    WASABI = "wasabi"

    def visit(
        self,
        aws: typing.Callable[[], T_Result],
        backblaze: typing.Callable[[], T_Result],
        wasabi: typing.Callable[[], T_Result],
    ) -> T_Result:
        if self is S3EventGetObjectLockConfigurationProvider.AWS:
            return aws()
        if self is S3EventGetObjectLockConfigurationProvider.BACKBLAZE:
            return backblaze()
        if self is S3EventGetObjectLockConfigurationProvider.WASABI:
            return wasabi()

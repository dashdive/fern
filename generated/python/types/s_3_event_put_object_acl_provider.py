# This file was auto-generated by Fern from our API Definition.

import enum
import typing

T_Result = typing.TypeVar("T_Result")


class S3EventPutObjectAclProvider(str, enum.Enum):
    AWS = "aws"
    BACKBLAZE = "backblaze"
    WASABI = "wasabi"

    def visit(
        self,
        aws: typing.Callable[[], T_Result],
        backblaze: typing.Callable[[], T_Result],
        wasabi: typing.Callable[[], T_Result],
    ) -> T_Result:
        if self is S3EventPutObjectAclProvider.AWS:
            return aws()
        if self is S3EventPutObjectAclProvider.BACKBLAZE:
            return backblaze()
        if self is S3EventPutObjectAclProvider.WASABI:
            return wasabi()
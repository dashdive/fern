/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPutObjectAclProvider: core.serialization.Schema<serializers.S3EventPutObjectAclProvider.Raw, BenJammingReillyApi.S3EventPutObjectAclProvider>;
export declare namespace S3EventPutObjectAclProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

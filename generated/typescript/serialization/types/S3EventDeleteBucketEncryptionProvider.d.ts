/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventDeleteBucketEncryptionProvider: core.serialization.Schema<serializers.S3EventDeleteBucketEncryptionProvider.Raw, BenJammingReillyApi.S3EventDeleteBucketEncryptionProvider>;
export declare namespace S3EventDeleteBucketEncryptionProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

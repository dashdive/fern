/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetBucketCorsProvider: core.serialization.Schema<serializers.S3EventGetBucketCorsProvider.Raw, BenJammingReillyApi.S3EventGetBucketCorsProvider>;
export declare namespace S3EventGetBucketCorsProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}
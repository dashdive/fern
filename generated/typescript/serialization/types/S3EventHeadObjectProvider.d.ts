/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventHeadObjectProvider: core.serialization.Schema<serializers.S3EventHeadObjectProvider.Raw, BenJammingReillyApi.S3EventHeadObjectProvider>;
export declare namespace S3EventHeadObjectProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventListObjectsV2Provider: core.serialization.Schema<serializers.S3EventListObjectsV2Provider.Raw, BenJammingReillyApi.S3EventListObjectsV2Provider>;
export declare namespace S3EventListObjectsV2Provider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

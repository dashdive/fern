/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObjectRetentionProvider: core.serialization.Schema<serializers.S3EventGetObjectRetentionProvider.Raw, BenJammingReillyApi.S3EventGetObjectRetentionProvider>;
export declare namespace S3EventGetObjectRetentionProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}
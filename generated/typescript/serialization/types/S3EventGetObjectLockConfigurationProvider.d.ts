/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObjectLockConfigurationProvider: core.serialization.Schema<serializers.S3EventGetObjectLockConfigurationProvider.Raw, BenJammingReillyApi.S3EventGetObjectLockConfigurationProvider>;
export declare namespace S3EventGetObjectLockConfigurationProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

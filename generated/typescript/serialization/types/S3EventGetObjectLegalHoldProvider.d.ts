/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObjectLegalHoldProvider: core.serialization.Schema<serializers.S3EventGetObjectLegalHoldProvider.Raw, BenJammingReillyApi.S3EventGetObjectLegalHoldProvider>;
export declare namespace S3EventGetObjectLegalHoldProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

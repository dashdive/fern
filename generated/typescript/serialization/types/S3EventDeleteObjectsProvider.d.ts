/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventDeleteObjectsProvider: core.serialization.Schema<serializers.S3EventDeleteObjectsProvider.Raw, BenJammingReillyApi.S3EventDeleteObjectsProvider>;
export declare namespace S3EventDeleteObjectsProvider {
    type Raw = "aws" | "backblaze" | "wasabi";
}

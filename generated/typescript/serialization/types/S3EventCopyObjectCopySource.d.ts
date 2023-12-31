/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventCopyObjectCopySource: core.serialization.ObjectSchema<serializers.S3EventCopyObjectCopySource.Raw, BenJammingReillyApi.S3EventCopyObjectCopySource>;
export declare namespace S3EventCopyObjectCopySource {
    interface Raw {
        bucket: string;
        objectKey: string;
        versionId?: string | null;
    }
}

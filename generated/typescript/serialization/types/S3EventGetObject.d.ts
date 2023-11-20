/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObject: core.serialization.ObjectSchema<serializers.S3EventGetObject.Raw, BenJammingReillyApi.S3EventGetObject>;
export declare namespace S3EventGetObject {
    interface Raw {
        bytes: number;
        versionId?: string | null;
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetObjectProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}
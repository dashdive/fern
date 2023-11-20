/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPutObject: core.serialization.ObjectSchema<serializers.S3EventPutObject.Raw, BenJammingReillyApi.S3EventPutObject>;
export declare namespace S3EventPutObject {
    interface Raw {
        bytes: number;
        versionId?: string | null;
        objectCategory?: string | null;
        fileType?: string | null;
        isSynthetic?: boolean | null;
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventPutObjectProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}
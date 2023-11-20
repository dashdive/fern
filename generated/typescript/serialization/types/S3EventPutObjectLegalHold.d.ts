/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPutObjectLegalHold: core.serialization.ObjectSchema<serializers.S3EventPutObjectLegalHold.Raw, BenJammingReillyApi.S3EventPutObjectLegalHold>;
export declare namespace S3EventPutObjectLegalHold {
    interface Raw {
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventPutObjectLegalHoldProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}
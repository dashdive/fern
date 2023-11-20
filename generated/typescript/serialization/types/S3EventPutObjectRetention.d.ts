/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPutObjectRetention: core.serialization.ObjectSchema<serializers.S3EventPutObjectRetention.Raw, BenJammingReillyApi.S3EventPutObjectRetention>;
export declare namespace S3EventPutObjectRetention {
    interface Raw {
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventPutObjectRetentionProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

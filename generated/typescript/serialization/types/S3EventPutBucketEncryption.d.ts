/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPutBucketEncryption: core.serialization.ObjectSchema<serializers.S3EventPutBucketEncryption.Raw, BenJammingReillyApi.S3EventPutBucketEncryption>;
export declare namespace S3EventPutBucketEncryption {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventPutBucketEncryptionProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}
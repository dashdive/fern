/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetBucketEncryption: core.serialization.ObjectSchema<serializers.S3EventGetBucketEncryption.Raw, BenJammingReillyApi.S3EventGetBucketEncryption>;
export declare namespace S3EventGetBucketEncryption {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetBucketEncryptionProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}
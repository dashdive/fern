/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetBucketCors: core.serialization.ObjectSchema<serializers.S3EventGetBucketCors.Raw, BenJammingReillyApi.S3EventGetBucketCors>;
export declare namespace S3EventGetBucketCors {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetBucketCorsProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

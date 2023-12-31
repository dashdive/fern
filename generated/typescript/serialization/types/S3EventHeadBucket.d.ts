/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventHeadBucket: core.serialization.ObjectSchema<serializers.S3EventHeadBucket.Raw, BenJammingReillyApi.S3EventHeadBucket>;
export declare namespace S3EventHeadBucket {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventHeadBucketProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

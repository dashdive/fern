/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetBucketAcl: core.serialization.ObjectSchema<serializers.S3EventGetBucketAcl.Raw, BenJammingReillyApi.S3EventGetBucketAcl>;
export declare namespace S3EventGetBucketAcl {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetBucketAclProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

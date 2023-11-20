/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObjectLockConfiguration: core.serialization.ObjectSchema<serializers.S3EventGetObjectLockConfiguration.Raw, BenJammingReillyApi.S3EventGetObjectLockConfiguration>;
export declare namespace S3EventGetObjectLockConfiguration {
    interface Raw {
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetObjectLockConfigurationProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventGetObjectLegalHold: core.serialization.ObjectSchema<serializers.S3EventGetObjectLegalHold.Raw, BenJammingReillyApi.S3EventGetObjectLegalHold>;
export declare namespace S3EventGetObjectLegalHold {
    interface Raw {
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventGetObjectLegalHoldProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventListParts: core.serialization.ObjectSchema<serializers.S3EventListParts.Raw, BenJammingReillyApi.S3EventListParts>;
export declare namespace S3EventListParts {
    interface Raw {
        uploadId: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventListPartsProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

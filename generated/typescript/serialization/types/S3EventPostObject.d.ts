/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventPostObject: core.serialization.ObjectSchema<serializers.S3EventPostObject.Raw, BenJammingReillyApi.S3EventPostObject>;
export declare namespace S3EventPostObject {
    interface Raw {
        bytes: number;
        versionId?: string | null;
        objectCategory?: string | null;
        fileType?: string | null;
        isSynthetic?: boolean | null;
        objectKey: string;
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventPostObjectProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

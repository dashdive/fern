/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventDeleteObjects: core.serialization.ObjectSchema<serializers.S3EventDeleteObjects.Raw, BenJammingReillyApi.S3EventDeleteObjects>;
export declare namespace S3EventDeleteObjects {
    interface Raw {
        deletedObjects: serializers.S3EventDeleteObjectsDeletedObjectsItem.Raw[];
        bucket: string;
        timestamp: string;
        provider: serializers.S3EventDeleteObjectsProvider.Raw;
        customerId?: string | null;
        featureId?: string | null;
        clientType?: string | null;
        clientId?: string | null;
    }
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "..";
import * as BenJammingReillyApi from "../../api";
import * as core from "../../core";
export declare const S3EventDeleteObjectsDeletedObjectsItem: core.serialization.ObjectSchema<serializers.S3EventDeleteObjectsDeletedObjectsItem.Raw, BenJammingReillyApi.S3EventDeleteObjectsDeletedObjectsItem>;
export declare namespace S3EventDeleteObjectsDeletedObjectsItem {
    interface Raw {
        objectKey: string;
        versionId?: string | null;
        isDeleteMarker?: boolean | null;
    }
}

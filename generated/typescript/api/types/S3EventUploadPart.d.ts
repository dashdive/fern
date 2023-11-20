/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as BenJammingReillyApi from "..";
export interface S3EventUploadPart {
    uploadId: string;
    bytes: number;
    partNumber: number;
    bucket: string;
    timestamp: Date;
    provider: BenJammingReillyApi.S3EventUploadPartProvider;
    customerId?: string;
    featureId?: string;
    clientType?: string;
    clientId?: string;
}

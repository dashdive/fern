/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as BenJammingReillyApi from "..";
export interface S3EventPutObject {
    bytes: number;
    versionId?: string;
    objectCategory?: string;
    fileType?: string;
    isSynthetic?: boolean;
    objectKey: string;
    bucket: string;
    timestamp: Date;
    provider: BenJammingReillyApi.S3EventPutObjectProvider;
    customerId?: string;
    featureId?: string;
    clientType?: string;
    clientId?: string;
}

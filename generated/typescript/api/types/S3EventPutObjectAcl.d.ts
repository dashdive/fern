/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as BenJammingReillyApi from "..";
export interface S3EventPutObjectAcl {
    objectKey: string;
    bucket: string;
    timestamp: Date;
    provider: BenJammingReillyApi.S3EventPutObjectAclProvider;
    customerId?: string;
    featureId?: string;
    clientType?: string;
    clientId?: string;
}
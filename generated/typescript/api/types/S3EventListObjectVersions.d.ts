/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as BenJammingReillyApi from "..";
export interface S3EventListObjectVersions {
    objectKey: string;
    bucket: string;
    timestamp: Date;
    provider: BenJammingReillyApi.S3EventListObjectVersionsProvider;
    customerId?: string;
    featureId?: string;
    clientType?: string;
    clientId?: string;
}
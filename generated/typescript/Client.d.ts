/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as core from "./core";
import * as BenJammingReillyApi from "./api";
export declare namespace BenJammingReillyApiClient {
    interface Options {
        environment: core.Supplier<string>;
    }
    interface RequestOptions {
        timeoutInSeconds?: number;
    }
}
export declare class BenJammingReillyApiClient {
    protected readonly _options: BenJammingReillyApiClient.Options;
    constructor(_options: BenJammingReillyApiClient.Options);
    /**
     * This endpoint receives notifications for events happening in an S3 bucket, like file uploads.
     * @throws {@link BenJammingReillyApi.BadRequestError}
     * @throws {@link BenJammingReillyApi.InternalServerError}
     */
    receiveS3Event(request: BenJammingReillyApi.S3Event, requestOptions?: BenJammingReillyApiClient.RequestOptions): Promise<BenJammingReillyApi.ReceiveS3EventResponse>;
}
package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputMediaContact}: inputMediaContact#f8ab7dfb</li>
 * <li>{@link TLInputMediaDice}: inputMediaDice#e66fbf7b</li>
 * <li>{@link TLInputMediaDocument}: inputMediaDocument#33473058</li>
 * <li>{@link TLInputMediaDocumentExternal}: inputMediaDocumentExternal#fb52dc99</li>
 * <li>{@link TLInputMediaEmpty}: inputMediaEmpty#9664f57f</li>
 * <li>{@link TLInputMediaGame}: inputMediaGame#d33f43f3</li>
 * <li>{@link TLInputMediaGeoLive}: inputMediaGeoLive#971fa843</li>
 * <li>{@link TLInputMediaGeoPoint}: inputMediaGeoPoint#f9c44144</li>
 * <li>{@link TLInputMediaInvoice}: inputMediaInvoice#d9799874</li>
 * <li>{@link TLInputMediaPhoto}: inputMediaPhoto#b3ba0635</li>
 * <li>{@link TLInputMediaPhotoExternal}: inputMediaPhotoExternal#e5bbfe1a</li>
 * <li>{@link TLInputMediaPoll}: inputMediaPoll#f94e5f1</li>
 * <li>{@link TLInputMediaUploadedDocument}: inputMediaUploadedDocument#5b38c6c1</li>
 * <li>{@link TLInputMediaUploadedPhoto}: inputMediaUploadedPhoto#1e287d04</li>
 * <li>{@link TLInputMediaVenue}: inputMediaVenue#c13d1c11</li>
 * </ul>
 *
 */
public abstract class TLAbsInputMedia extends TLObject {
    public TLAbsInputMedia() {
    }
}

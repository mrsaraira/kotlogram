package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLRecentMeUrlChat}: recentMeUrlChat#b2da71d2</li>
 * <li>{@link TLRecentMeUrlChatInvite}: recentMeUrlChatInvite#eb49081d</li>
 * <li>{@link TLRecentMeUrlStickerSet}: recentMeUrlStickerSet#bc0a57dc</li>
 * <li>{@link TLRecentMeUrlUnknown}: recentMeUrlUnknown#46e1d13d</li>
 * <li>{@link TLRecentMeUrlUser}: recentMeUrlUser#b92c09e2</li>
 * </ul>
 *
 */
public abstract class TLAbsRecentMeUrl extends TLObject {
    protected String url;

    public TLAbsRecentMeUrl() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

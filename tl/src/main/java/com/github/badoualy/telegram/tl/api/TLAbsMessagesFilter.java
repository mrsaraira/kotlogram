package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputMessagesFilterChatPhotos}: inputMessagesFilterChatPhotos#3a20ecb8</li>
 * <li>{@link TLInputMessagesFilterContacts}: inputMessagesFilterContacts#e062db83</li>
 * <li>{@link TLInputMessagesFilterDocument}: inputMessagesFilterDocument#9eddf188</li>
 * <li>{@link TLInputMessagesFilterEmpty}: inputMessagesFilterEmpty#57e2f66c</li>
 * <li>{@link TLInputMessagesFilterGeo}: inputMessagesFilterGeo#e7026d0d</li>
 * <li>{@link TLInputMessagesFilterGif}: inputMessagesFilterGif#ffc86587</li>
 * <li>{@link TLInputMessagesFilterMusic}: inputMessagesFilterMusic#3751b49e</li>
 * <li>{@link TLInputMessagesFilterMyMentions}: inputMessagesFilterMyMentions#c1f8e69a</li>
 * <li>{@link TLInputMessagesFilterPhoneCalls}: inputMessagesFilterPhoneCalls#80c99768</li>
 * <li>{@link TLInputMessagesFilterPhotoVideo}: inputMessagesFilterPhotoVideo#56e9f0e4</li>
 * <li>{@link TLInputMessagesFilterPhotos}: inputMessagesFilterPhotos#9609a51c</li>
 * <li>{@link TLInputMessagesFilterPinned}: inputMessagesFilterPinned#1bb00451</li>
 * <li>{@link TLInputMessagesFilterRoundVideo}: inputMessagesFilterRoundVideo#b549da53</li>
 * <li>{@link TLInputMessagesFilterRoundVoice}: inputMessagesFilterRoundVoice#7a7c17a4</li>
 * <li>{@link TLInputMessagesFilterUrl}: inputMessagesFilterUrl#7ef0dd87</li>
 * <li>{@link TLInputMessagesFilterVideo}: inputMessagesFilterVideo#9fc00e65</li>
 * <li>{@link TLInputMessagesFilterVoice}: inputMessagesFilterVoice#50f5c392</li>
 * </ul>
 *
 */
public abstract class TLAbsMessagesFilter extends TLObject {
    public TLAbsMessagesFilter() {
    }
}

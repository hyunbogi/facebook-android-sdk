// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.share.internal

import com.facebook.internal.DialogFeature
import com.facebook.internal.NativeProtocol

/**
 * com.facebook.share.internal is solely for the use of other packages within the Facebook SDK for
 * Android. Use of any of the classes in this package is unsupported, and they may be modified or
 * removed without warning at any time.
 */
enum class ShareStoryFeature(private val minVersion: Int) : DialogFeature {
  SHARE_STORY_ASSET(NativeProtocol.PROTOCOL_VERSION_20170417);

  /** This method is for internal use only. */
  override fun getAction(): String {
    return NativeProtocol.ACTION_SHARE_STORY
  }

  /** This method is for internal use only. */
  override fun getMinVersion(): Int {
    return minVersion
  }
}

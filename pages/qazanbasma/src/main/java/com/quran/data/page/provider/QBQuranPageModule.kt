package com.quran.data.page.provider

import com.quran.data.page.provider.qazanbasma.KazanBasmaPageProvider
import com.quran.data.source.PageProvider
import com.quran.page.common.draw.ImageDrawHelper
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
object QBQuranPageModule {

  @JvmStatic
  @Provides
  @IntoMap
  @StringKey("qazanbasma")
  fun provideMadaniPageSet(): PageProvider {
    return KazanBasmaPageProvider()
  }

  @JvmStatic
  @Provides
  @ElementsIntoSet
  fun provideImageDrawHelpers(): Set<ImageDrawHelper> {
    return emptySet()
  }
}

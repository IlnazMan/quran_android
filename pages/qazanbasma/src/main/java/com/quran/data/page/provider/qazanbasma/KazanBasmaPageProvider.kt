package com.quran.data.page.provider.qazanbasma

import com.quran.data.pageinfo.common.QazanBasmaDataSource
import com.quran.data.pageinfo.common.size.DefaultPageSizeCalculator
import com.quran.data.pageinfo.common.size.QazanBasmaPageSizeCalculator
import com.quran.data.source.DisplaySize
import com.quran.data.source.PageProvider
import com.quran.data.source.PageSizeCalculator
import com.quran.labs.androidquran.pages.qazanbasma.R

class KazanBasmaPageProvider : PageProvider {
  private val baseUrl = "https://android.quran.com/data"
  private val baseUrlQB = "https://firebasestorage.googleapis.com/v0/b/islamic-radio.appspot.com/o/data"
  private val dataSource = QazanBasmaDataSource()

  override fun getDataSource() = dataSource

  override fun getPageSizeCalculator(displaySize: DisplaySize): PageSizeCalculator =
      QazanBasmaPageSizeCalculator(displaySize)

  override fun getImageVersion() = -1

  override fun getImagesBaseUrl() = "$baseUrlQB%2F"

  override fun getImagesZipBaseUrl() = "$baseUrlQB%2Fzips%2F"

  override fun getPatchBaseUrl() = "$baseUrl/patches/v"

  override fun getAyahInfoBaseUrl() = "$baseUrl/databases/ayahinfo/"

  override fun getAudioDirectoryName() = "audio"

  override fun getDatabaseDirectoryName() = "databases"

  override fun getAyahInfoDirectoryName() = getDatabaseDirectoryName()

  override fun getDatabasesBaseUrl() = "$baseUrl/databases/"

  override fun getAudioDatabasesBaseUrl() = getDatabasesBaseUrl() + "audio/"

  override fun getImagesDirectoryName() = ""

  override fun getPreviewTitle() = R.string.kb_title

  override fun getPreviewDescription() = R.string.kb_description
}

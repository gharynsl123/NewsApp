package com.example.newsapp

import android.content.Intent
import com.example.newsapp.databinding.NewsHeadlineBinding
import java.text.FieldPosition

fun bindingNewsHeadline(binding :NewsHeadlineBinding, posisition: Int){
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[posisition])
        tvTitleHeadline.text =  DataNews.titleHeadline[posisition]
        tvDescHeadline.text =  DataNews.contentHeadline[posisition]
        tvDateHeadline.text =  DataNews.dateHeadline[posisition]
        tvAuthorHeadline.text =  DataNews.authorHeadline[posisition]
    }

    binding.root.setOnClickListener {
        val intentToDetail = Intent(binding.root.context, DetailActivity::class.java)
        intentToDetail.putExtra(DetailActivity.EXTRA_TITLE_HEADLINE, DataNews.titleHeadline[posisition])
        intentToDetail.putExtra(DetailActivity.EXTRA_IMAGE_HEADLINE, DataNews.photoHeadline[posisition])
        intentToDetail.putExtra(DetailActivity.EXTRA_CONTENT_HEADLINE, DataNews.contentHeadline[posisition])
        intentToDetail.putExtra(DetailActivity.EXTRA_DATE_HEADLINE, DataNews.dateHeadline[posisition])
        intentToDetail.putExtra(DetailActivity.EXTRA_AUTHOR_HEADLINE, DataNews.authorHeadline[posisition])
        binding.root.context.startActivity(intentToDetail)
    }
}
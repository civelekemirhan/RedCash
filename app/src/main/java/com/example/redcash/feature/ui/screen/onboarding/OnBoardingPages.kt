package com.example.redcash.feature.ui.screen.onboarding

import com.example.redcash.R

sealed class OnBoardingPages(val title: Int, val description: Int){
    data object First: OnBoardingPages(R.string.onboarding_first_header_text,R.string.onboarding_first_content_text)
    data object Second: OnBoardingPages(R.string.onboarding_second_header_text,R.string.onboarding_second_content_text)
    data object Third: OnBoardingPages(R.string.onboarding_third_header_text,R.string.onboarding_third_content_text)
}
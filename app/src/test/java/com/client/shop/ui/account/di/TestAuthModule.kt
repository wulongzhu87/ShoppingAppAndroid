package com.client.shop.ui.account.di

import com.client.shop.ui.account.contract.*
import com.nhaarman.mockito_kotlin.mock
import dagger.Module
import dagger.Provides

@Module
class TestAuthModule {

    @Provides
    fun provideSignUpPresenter(): SignUpPresenter = mock()

    @Provides
    fun provideSignInPresenter(): SignInPresenter = mock()

    @Provides
    fun provideAuthPresenter(): AccountPresenter = mock()

    @Provides
    fun provideForgotPasswordPresenter(): ForgotPasswordPresenter = mock()

    @Provides
    fun providePersonalInfoPresenter(): PersonalInfoPresenter = mock()

    @Provides
    fun provideChangePasswordPresenter(): ChangePasswordPresenter = mock()

    @Provides
    fun provideAccountSettingsPresenter(): AccountSettingsPresenter = mock()
}
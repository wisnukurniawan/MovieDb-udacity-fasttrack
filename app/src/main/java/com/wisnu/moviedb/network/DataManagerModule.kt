package com.wisnu.moviedb.network

import com.wisnu.moviedb.network.model.ApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by wisnu on 13/06/2017.
 */
@Module
class DataManagerModule {

    @Provides
    @Singleton
    fun provideDataManager(apiClient: ApiClient): DataManager {
        return DataManager(apiClient)
    }

}
package com.github.util;

import com.github.pojo.responseDto.search.SearchRepositoryDto;
import com.github.pojo.responseDto.userRepo.Project;

public interface GithubService {

	SearchRepositoryDto getSearchRepository(MyGithubRequest request);
	Project[] getUserRepoDetails(MyGithubRequest request);
	
}

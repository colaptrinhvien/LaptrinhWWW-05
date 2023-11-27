package service;

import repo.JobRepository;


@service
public class JobService {
	@Autowized
	private JobRepository repository;

}

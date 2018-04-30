package javabrains.springboot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	private List<Topics> topics = Arrays.asList(
			new Topics(1,"name","description"),
			new Topics(2,"name", "description")
			);
	
	public List<Topics> getAllTopics() {
		return topics;
	}
	
	public Topics getTopicById(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}

}

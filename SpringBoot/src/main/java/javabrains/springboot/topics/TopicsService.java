package javabrains.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	private List<Topics> topics = new ArrayList<>(Arrays.asList(
			new Topics(1,"Spring","Spring description"),
			new Topics(2,"Java", "Java description")
			));
	
	public List<Topics> getAllTopics() {
		return topics;
	}
	
	public Topics getTopicById(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topics.add(topic);
	}
}

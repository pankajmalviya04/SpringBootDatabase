package com.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;	
	
	
	public List<Topic> getTopic() {		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topicRepository.findOne(id);
		
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}
	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		
	}
		
}

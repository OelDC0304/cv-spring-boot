package com.devtalles.tu_cv_spring_boot.tuCV.service;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devtalles.tu_cv_spring_boot.tuCV.model.CvData;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Education;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Experience;
import com.devtalles.tu_cv_spring_boot.tuCV.model.PersonalDetails;
import com.devtalles.tu_cv_spring_boot.tuCV.model.Skill;

@Service 
public class CvInitializationServiceImpl implements CvInitializationService {

    @Override
    public CvData initializeCvData() {
        // Create and initialize CvData object with sample data
        CvData cvData = new CvData();
        // Set personal details, experiences, education, and skills as needed
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("John");
        personalDetails.setLastName("Doe");
        personalDetails.setEmail("john.doe@example.com");
        personalDetails.setPhoneNumber("123-456-7890");
        personalDetails.setAddress("123 Main St");
        personalDetails.setCity("Anytown");
        personalDetails.setProvince("State");
        personalDetails.setPostalCode("12345");
        personalDetails.setProfessionalProfile("Experienced software developer with a passion for creating innovative solutions.");
        cvData.setPersonalDetails(personalDetails);

        //Education, Experience, and Skills can be initialized similarly
        Education education = new Education();
        education.setInstitutionName("University of Example");
        education.setDegree("Bachelor of Science in Computer Science");
        education.setPeriodOfStudy("2010 - 2014");
        education.setDescription("Studied various aspects of computer science including algorithms, data structures, and software engineering.");
        //cvData.setEducation(List.of(education));
        cvData.setEducation(Collections.singletonList(education));

        //Experience
        Experience experience = new Experience();
        experience.setJobTitle("Software Engineer");
        experience.setCompanyName("Tech Solutions Inc.");
        experience.setPeriodOfEmployment("2015 - Present");
        experience.setDescription("Developing and maintaining web applications using Java and Spring Boot.");
        cvData.setExperiences(List.of(experience));
        //Skills
        Skill skill = new Skill();
        skill.setSkillName("Java");
        skill.setProficiencyLevel("Advanced");

        Skill skill2 = new Skill();
        skill2.setSkillName("Spring Boot");
        skill2.setProficiencyLevel("Intermediate");
        cvData.setSkills(Arrays.asList(skill, skill2));


        return cvData;
    }

}

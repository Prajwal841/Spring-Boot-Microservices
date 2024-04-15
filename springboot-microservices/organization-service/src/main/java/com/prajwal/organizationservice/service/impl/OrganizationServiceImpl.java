package com.prajwal.organizationservice.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.prajwal.organizationservice.dto.OrganizationDto;
import com.prajwal.organizationservice.entity.Organization;
import com.prajwal.organizationservice.mapper.OrganizationMapper;
import com.prajwal.organizationservice.repository.OrganizationRepository;
import com.prajwal.organizationservice.service.OrganizationService;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}

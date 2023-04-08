package com.facegram.facegrambackend.service.analysis

import com.facegram.facegrambackend.dto.request.analysis.AnalysisLowCreateRequestDto
import com.facegram.facegrambackend.security.CustomUserDetails
import org.springframework.http.ResponseEntity
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

interface AnalysisService {

    fun createAnalysis(
        analysisLowCreateRequestDto: AnalysisLowCreateRequestDto,
        user: CustomUserDetails,
        request: HttpServletRequest,
        response: HttpServletResponse
    ): ResponseEntity<Any>
}
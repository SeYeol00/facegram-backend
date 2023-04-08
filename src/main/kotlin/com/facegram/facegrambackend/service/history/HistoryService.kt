package com.facegram.facegrambackend.service.history

import com.facegram.facegrambackend.dto.response.history.analysishistory.AnalysisHistoryResponseDto
import com.facegram.facegrambackend.dto.response.history.userhistory.UserHistoryAnalysisDto
import org.springframework.http.ResponseEntity
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

interface HistoryService {

    fun historySearchByUser(userId: Long): MutableList<UserHistoryAnalysisDto>

    fun historySearchById(id: Long): AnalysisHistoryResponseDto

    fun historyDeleteById(id: Long, request: HttpServletRequest, response: HttpServletResponse): ResponseEntity<Any>
}
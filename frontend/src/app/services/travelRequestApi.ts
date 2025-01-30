import type { TravelRequestType } from "../types/travelRequestType";

const API_URL = process.env.NEXT_PUBLIC_API_URL || "http://localhost:8000";

export async function fetchTravelRequests(): Promise<{ data: TravelRequestType[], total: number }> {
  try {
    const response = await fetch(`${API_URL}/api/travel-requests/last-three-months`);
    const result = await response.json();
    return { data: result, total: result.length };
  } catch (error) {
    return { data: [], total: 0 };
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: experiment_status.proto

package org.chromium.components.sync.protocol;

public interface ExperimentStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ExperimentStatusRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Enumerates the experiments for which the status should be returned.  An
   * experiment name must be the same as one of the field names specified in
   * ExperimentsSpecifics.  See sync/protocol/experiments_specifics.proto.
   * </pre>
   *
   * <code>repeated string experiment_name = 1;</code>
   */
  java.util.List<String>
      getExperimentNameList();
  /**
   * <pre>
   * Enumerates the experiments for which the status should be returned.  An
   * experiment name must be the same as one of the field names specified in
   * ExperimentsSpecifics.  See sync/protocol/experiments_specifics.proto.
   * </pre>
   *
   * <code>repeated string experiment_name = 1;</code>
   */
  int getExperimentNameCount();
  /**
   * <pre>
   * Enumerates the experiments for which the status should be returned.  An
   * experiment name must be the same as one of the field names specified in
   * ExperimentsSpecifics.  See sync/protocol/experiments_specifics.proto.
   * </pre>
   *
   * <code>repeated string experiment_name = 1;</code>
   */
  java.lang.String getExperimentName(int index);
  /**
   * <pre>
   * Enumerates the experiments for which the status should be returned.  An
   * experiment name must be the same as one of the field names specified in
   * ExperimentsSpecifics.  See sync/protocol/experiments_specifics.proto.
   * </pre>
   *
   * <code>repeated string experiment_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getExperimentNameBytes(int index);
}
